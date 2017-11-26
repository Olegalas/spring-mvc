<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Hello</title>
</head>
<body>
    <h1>Hello page</h1>
    <p>Message : ${message}</p>

    <h4>POST request on servlet</h4>
    <form action="/model" method="post">

        <label>Enter name
            <input type="text" name="name" />
        </label>
        <br>
        <label>Enter email
            <input type="text" name="email" />
        </label>
        <br>
        <input type="submit" value="submit" />
    </form>

    <h4>POST request on servlet param</h4>
    <form action="/param" method="post">

        <label>Enter name
            <input type="text" name="name" />
        </label>
        <br>
        <label>Enter email
            <input type="text" name="email" />
        </label>
        <br>
        <input type="submit" value="submit" />
    </form>

    <h4>POST request on servlet param</h4>
    <input type="button" onclick="send()" value="send" />
    <script src="/js/app.js"></script>

    <h4>Redirect on google</h4>
    <form action="/redirect" method="post">
        <input type="submit" value="redirect" />
    </form>

</body>
</html>