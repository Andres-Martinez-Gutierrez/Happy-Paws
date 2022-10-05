$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
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
                let user_name = parsedResult['user_name'];
                document.location.href = "home.html?user_name=" + user_name;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarUsuario() {

    let cedula = $("#input-cedula").val();
    let username = $("#input-username").val();
    let apellido = $("#input-apellido").val();
    let direccion = $("#input-direccion").val();
    let telefono = $("#input-telefono").val();
    let correo = $("#input-email").val();
    let pin = $("#input-pin").val();
    let pin2 = $("#input-pin2").val();
    let nombreMascota = $("#input-nombreMascota").val();
    let especie = $("#input-especie").val();
    let fecha = $("#input-fecha").val();
    let color = $("#input-color").val();
    let sexo = $("#input-sexo").val();
    let raza = $("#input-raza").val();

    if (pin == pin2) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({
                cedula: cedula,
                username: username,
                apellido: apellido,
                direccion: direccion,
                telefono: telefono,
                correo: correo,
                pin: pin,
                pin2: pin2,
                nombreMascota: nombreMascota,
                especie: especie,
                fecha: fecha,
                color: color,
                sexo: sexo,
                raza: raza
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let username = parsedResult['username'];
                    document.location.href = "home.html?username=" + username;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}


