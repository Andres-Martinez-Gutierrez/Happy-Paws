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
                let user_name = parsedResult['user_name'];
                document.location.href = "home.html?user_name=" + user_name;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}

function registrarUsuario() {
    
    let username = $("#input-username").val();
    let cedula = $("#input-cedula").val();
    let nombre = $("#input-nombre").val();
    let apellido = $("#input-apellido").val();
    let direccion = $("#input-direccion").val();
    let telefono = $("#input-telefono").val();
    let correo = $("#input-correo").val();
    let pin = $("#input-pin").val();
    let pinConfirmacion = $("#input-pin-repeat").val();
    let nombreMascota = $("#input-nombreMascota").val();
    let especie = $("#input-especie").val();
  //  let fechaNacimiento = $("#input-fechaNacimiento").val();
    let colorMascota = $("#input-colorMascota").val();
    let sexoMascota= $("#input-sexoMascota").val();
    let raza = $("#input-raza").val();
    
    if (pin == pinConfirmacion) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegister",
            data: $.param({ 
                username: username,
                cedula: cedula,
                nombre: nombre,
                apellido: apellido,
                direccion: direccion,
                telefono: telefono,
                correo: correo,
                pin: pin,
                nombreMascota: nombreMascota,
                especie: especie,
                //fechaNacimiento: fechaNacimiento,
                colorMascota: colorMascota,
                sexoMascota: sexoMascota,
                raza: raza
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                     let user_name = parsedResult['user_name'];
                document.location.href = "home.html?user_name=" + user_name;
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

