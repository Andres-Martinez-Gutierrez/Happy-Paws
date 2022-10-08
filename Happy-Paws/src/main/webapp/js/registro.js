const enviar = document.getElementById('enviarDatos');
const registro = document.getElementById('formulario');
const inputs = document.querySelectorAll('#formulario input');

const expresiones = {
    usuario: /^[a-zA-Z0-9\_\-\.]{4,16}$/, // Letras, numeros, guion, guion_bajo, puntos
    nombre: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
    password: /^.{4}$/, // 4 a 12 digitos.
    correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/, //Se debe escribir el correo junto con el dominio
    telefono: /^\d{7,14}$/, // 7 a 14 numeros.
    cedula: /^\d{4,14}$/, //Solo numeros, sin espacios, comas o puntos
    direccion: /^[a-zA-Z0-9\_\-\#]{1,16}$/
};

const campos = {
    nombre: false,
    apellidos: false,
    cedula: false,
    email: false,
    direccion: false,
    telefono: false,
    nameUsuario: false,
    id: false,
    nombreMascota: false,
    fechaNacimiento: false,
    especie: false,
    raza: false,
    sexo: false,
    color: false
};

const validarForm = (e) => {
    switch (e.target.name) {
        case "nombre":
            validarCampo(expresiones.nombre, e.target, 'nombre');
            break;

        case "apellidos":
            validarCampo(expresiones.nombre, e.target, 'apellidos');
            break;

        case "cedula":
            validarCampo(expresiones.cedula, e.target, 'cedula');
            break;

        case "email":
            validarCampo(expresiones.correo, e.target, 'email');
            break;

        case "direccion":
            validarCampo(expresiones.direccion, e.target, 'direccion');
            break;

        case "telefono":
            validarCampo(expresiones.telefono, e.target, 'telefono');
            break;

        case "nameUsuario":
            validarCampo(expresiones.usuario, e.target, 'nameUsuario');
            break;

        case "pin1":
            validarCampo(expresiones.password, e.target, 'id1');
            validarId2();
            break;

        case "pin2":
            validarCampo(expresiones.password, e.target, 'id2');
            validarId2();
            break;

        case "nombreMascota":
            validarCampo(expresiones.nombre, e.target, 'nombreMascota');
            break;

        case "fechaNacimiento":

            break;

        case "especie":

            break;

        case "raza":
            validarCampo(expresiones.nombre, e.target, 'raza');
            break;

        case "sexo":

            break;

        case "color":
            validarCampo(expresiones.nombre, e.target, 'color');
            break;

    }
};

const validarCampo = (expresion, input, campo) => {
    if (expresion.test(input.value)) {
        document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-incorrecto');
        document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-correcto');
        /*document.querySelector(`#grupo__${campo}`).classList.add('fa-check-circle');
         document.querySelector(`#grupo__${campo}`).classList.remove('fa-times-circle');*/
        campos[campo] = true;
    } else {
        document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-incorrecto');
        document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-correcto');

        /*document.querySelector(`#grupo__${campo}`).classList.add('fa-times-circle');
         document.querySelector(`#grupo__${campo}`).classList.remove('fa-check-circle');*/
        campos[campo] = false;
    }
};

const validarId2 = () => {
    const inputPin1 = document.getElementById('pin');
    const inputPin2 = document.getElementById('pin2');

    if (inputPin1.value !== inputPin2.value) {
        document.getElementById(`grupo__id2`).classList.add('formulario__grupo-incorrecto');
        document.getElementById(`grupo__id2`).classList.remove('formulario__grupo-correcto');
        /*document.querySelector(`#grupo__id2 i`).classList.add('fa-times-circle');
         document.querySelector(`#grupo__id2 i`).classList.remove('fa-check-circle');*/
        campos['id'] = false;
    } else {
        document.getElementById(`grupo__id2`).classList.remove('formulario__grupo-incorrecto');
        document.getElementById(`grupo__id2`).classList.add('formulario__grupo-correcto');
        /*document.querySelector(`#grupo__id2`).classList.remove('fa-times-circle');
         document.querySelector(`#grupo__id2`).classList.add('fa-check-circle');*/
        campos['id'] = true;
    }
};

inputs.forEach((input) => {
    input.addEventListener('keyup', validarForm);
    input.addEventListener('blur', validarForm);
});

 enviar.addEventListener('submit', (e) => {
    e.preventDefault();

    if (campos.nombre && campos.apellidos && campos.cedula && campos.email && campos.direccion && campos.telefono && campos.nameUsuario && campos.id && campos.nombreMascota /*&& campos.fechaNacimiento*/ && campos.especie && campos.raza /*&& campos.sexo*/ && campos.color) {
        registro.reset();//Se reinician todos los campos del formulario
        document.getElementById('formulario__mensaje-exito').classList.add('formulario__mensaje-exito-activo');
        setTimeout(() => {
            document.getElementById('formulario__mensaje-exito').classList.remove('formulario__mensaje-exito-activo');
       }, 5000);

        /*document.querySelectorAll('.formulario__grupo-correcto').forEach((icono) => {
         icono.classList.remove('formulario__grupo-correcto');
         });*/
    } else {
        document.getElementById('formulario__mensaje').classList.add('formulario__mensaje-activo');
        setTimeout(() => {
            document.getElementById('formulario__mensaje').classList.remove('formulario__mensaje-activo');
        }, 5000);
    }


});
