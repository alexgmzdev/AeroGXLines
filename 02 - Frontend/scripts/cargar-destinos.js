var url = ""
fetch(url)
    .then(response=>response.text())
    .then(respuesta => mostrarDestinos(respuesta))


//VARIABLES
var img_ciudad = document.createElement("img");
img_ciudad.id="img_ciudad";

var nombreCiudad = document.createElement("p");
nombreCiudad.id="nmb_ciudad"

function mostrarDestinos(respuesta){
    var infoCiudad = JSON.parse(respuesta);
    console.log(infoCiudad);

}