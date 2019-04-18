

$(document).ready(function() {
    fetchCustomers();
});

//GET
function fetchCustomers(){
    $.ajax({
        url: 'http://localhost:8080/javabank5/api/customer',
        async: true,
        success:populateCustomers,
    });
}


$("#form").submit (function(event){
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
    var customersTable = $("#customer-table");

    customerData.forEach(function(element) {
        elementStr =
            "<div class='desc'th:text='${friend.id}' type='hidden' >"+
            "<p>" + element.name +"</p>" +
            "<p>" + element.phone + "</p>" +
            "<p><a class='btn btn-primary btn-luxe-primary'>Book Friend<i class='ti-angle-right'></i></a></p></div>"

        $(elementStr).appendTo(customersTable);
    });
}
