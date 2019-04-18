

$(document).ready(function() {
    setupEventListener()
});

function setupEventListener() {
    $("#search-button").click(function () {
        fetchCustomers();
    })
}

//GET
function fetchCustomers(){
    $.ajax({
        url: 'http://localhost:8080/afriendlikeme/api/host',
        async: true,
        success:populateCustomers
    });
}


$("#form").submit(function(event){
    add();
});

//POST
function add(){
    $.ajax({
        url: 'http://localhost:8080/javabank5/api/customer',
        type: 'POST',
        data: JSON.stringify({
            firstname: $("#fname"),
            lastname: $("#lname"),
            email:$("#email"),
            phone: $("#phone"),
        }),
        async: true,
        contentType: 'application/json',
        success: populateCustomers,
    });
}




function populateCustomers(customerData) {
    var elementStr;
    var offerTable = $("#offer-table");

    customerData.forEach(function(element) {
        elementStr =
            "<tr><td>div class='f-hotel'>" +
            "<div class='image' style='background-image: url(images/hotel_feture_2.jpg);'>" +
            "<div class='descrip text-center'>" +
            "<p><small>For as low as</small><span>" + element.price + "</span></p>" +
        "</div></div>" +
        "<div class='desc'>" +
            "<h3>" + element.name + "</h3>" +
            "<p>" + element.email + "</p>" +
            "<p>" + element.phone + "</p>" +
        "</div> </td></tr>";

        $(elementStr).appendTo(offerTable);
    });
}
