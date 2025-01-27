<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bem-vindo</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body, html {
            height: 100%;
        }
        .bg {
            background-image: url('https://source.unsplash.com/random/1920x1080');
            height: 100%;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
        .overlay {
            background-color: rgba(0, 0, 0, 0.5);
            height: 100%;
            display: flex;
            justify-content: center;
            align-items: center;
            color: white;
        }
        .btn-custom {
            width: 150px;
        }
    </style>
</head>
<body>
    <div class="bg">
        <div class="overlay">
            <div class="text-center">
                <h1 class="display-4">Bem-vindo!</h1>
                <p class="lead">DCC192 - Laboratório de Programação de Sistemas Web</p>
                <div class="mt-4">
                    <a href="Login.jsp" class="btn btn-primary btn-custom mr-2">Login</a>
                    <a href="Ajuda.jsp" class="btn btn-secondary btn-custom">Ajuda</a>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
