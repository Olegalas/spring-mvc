function send() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        // NOPE
    };
    xhttp.open("POST", "/user/777?name=DEX&email=someEmail", true);
    xhttp.send();
}