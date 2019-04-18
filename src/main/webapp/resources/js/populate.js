$(document).ready(function() {
    setupEventListener()
});

function setupEventListener() {
    console.log("oasiuc")
    $("#search-button").click(function () {
        console.log("cuahsioucha")
        fetchCustomers();
    })
}

//GET
function fetchCustomers(){
    console.log("kajshdkjah")
    $.ajax({
        url: 'http://localhost:8080/afriendlikeme/api/host/',
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




function populateCustomers(response) {
    console.log("Kjhcoijasopncpasoncpaonscopsan");
    var elementStr;
    var offerTable = $("#offer-table");
    console.log(response)

    response.forEach(function(element) {
        elementStr =
            "<div  class='feature-full-2col'>"+
            "<div class='f-hotel'>" +
            "<div class='image' style='background-image: url(images/hotel_feture_2.jpg);'>" +
            "<div class='descrip text-center'>" +
            "<p><small>For as low as </small><span>" + element.price + " €/per day</span></p>" +
        "</div>"+"</div>" +
        "<div class='desc'>" +
            "<h3>" + element.name + "</h3>" +
            "<p>" + element.date + "</p>" +
            "<p>" + element.phone + "</p>" +
            "<p>" + element.email + "</p>" +
        "</div></div>" + " "+
            "<div class='f-hotel'>" +
            "<div class='image' style='background-image: url(images/hotel_feture_1.jpg);'>" +
            "<div class='descrip text-center'>" +
            "<p><small>For as low as </small><span>" + element.price + " €/per day</span></p>" +
            "</div>"+"</div>" +
            "<div class='desc'>" +
            "<h3>" + element.name + "</h3>" +
            "<p>" + element.date + "</p>" +
            "<p>" + element.phone + "</p>" +
            "<p>" + element.email + "</p>" +
            "</div></div>" +

            "</div>"

        ;

        $(elementStr).appendTo(offerTable);
    });
}
