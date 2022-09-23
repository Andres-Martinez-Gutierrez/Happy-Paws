$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });


});

function autenticarUsuario() {

    let user_name = $("#user_name").val();
    let pin = $("#pin").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            user_name: user_name,
            pin: pin
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let user_name= parsedResult['user_name'];
                document.location.href = "home.html?user_name=" + user_name;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
