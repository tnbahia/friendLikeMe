$(document).ready(function () {
    setupEventListener()
});

function setupEventListener() {
    console.log("setup");
    $("#register-button").click(function () {
        console.log("register");
        add();
    })

    $("#search-button").click(function () {
        console.log("search");
        fetchCustomers();
    });

    /*$("#form").submit(function (event) {
        add();
    });*/
}

//GET
function fetchCustomers() {
    console.log("fetching");
    $.ajax({
        url: 'http://localhost:8080/afriendlikeme/api/host/',
        async: true,
        success: populateCustomers
    });
}



//POST
function add() {
    console.log("adding");
    $.ajax({
        url: 'http://localhost:8080/afriendlikeme/api/host/',
        type: 'POST',
        data: JSON.stringify({
            name: $("#name").val(),
            email: $("#email").val(),
            phone: $("#phone").val(),
            price: $("#price").val(),
            startDate: $("#startDate").val(),
            endDate: $("#endDate").val(),
            city: $("#city").val()
        })
        /*data: JSON.stringify({
            name: "FDabio",
            email: "asdasd",
            phone: "09809123",
            price: "30",
            startDate: "61509024000000",
            endDate: "61511702400000",
            city: "Liasbo"
        })*/,
        async: true,
        dataType: 'json',
        contentType: 'application/json',
        success: populateCustomers
    });
}

function populateCustomers(response) {
    console.log("Kjhcoijasopncpasoncpaonscopsan");
    var elementStr;
    var offerTable = $("#offer-table");
    console.log(response)

    response.forEach(function (element) {
        elementStr =
            "<div  class='feature-full-2col'>" +
            "<div class='f-hotel'>" +
            "<div class='image' style='background-image: url(images/hotel_feture_2.jpg);'>" +
            "<div class='descrip text-center'>" +
            "<p><small>For as low as </small><span>" + element.price + " €/per day</span></p>" +
            "</div>" + "</div>" +
            "<div class='desc'>" +
            "<h3>" + element.name + "</h3>" +
            "<p>From: " + element.startDate + "</p>" +
            "<p>To: " + element.endDate + "</p>" +
            "<p>Phone: " + element.phone + "</p>" +
            "<p>Email: " + element.email + "</p>" +
            "</div></div></div>"

        ;

        $(elementStr).appendTo(offerTable);
    });
}
