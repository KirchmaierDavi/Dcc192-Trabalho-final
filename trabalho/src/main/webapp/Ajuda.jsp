jsp
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ajuda</title>
    <link
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="/css/style.css" />
  </head>
  <body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <a class="navbar-brand" href="#">Sistema de Usuários</a>
      <div class="collapse navbar-collapse justify-content-end">
        <a href="home.jsp" class="btn btn-outline-light mr-2">Home</a>
        <form class="form-inline" action="/logout" method="post">
          <button class="btn btn-outline-light" type="submit">Logout</button>
        </form>
      </div>
    </nav>

    <div class="bg">
      <div class="overlay">
        <div class="container">
          <div class="text-center p-4">
            <div class="card">
              <div class="card-body">
                <h1 class="display-4 mb-4">Central de Ajuda</h1>

                <div class="accordion" id="helpAccordion">
                  <div class="card">
                    <div class="card-header" id="headingTwo">
                      <h2 class="mb-0">
                        <button
                          class="btn btn-link collapsed"
                          type="button"
                          data-toggle="collapse"
                          data-target="#collapseTwo"
                        >
                          <i class="fas fa-sign-in-alt"></i> Como fazer login
                        </button>
                      </h2>
                    </div>
                    <div
                      id="collapseTwo"
                      class="collapse"
                      data-parent="#helpAccordion"
                    >
                      <div class="card-body">
                        <p>Para acessar sua conta:</p>
                        <ol class="text-left">
                          <li>Clique em "Login" no menu principal</li>
                          <li>Digite seu usuário e senha</li>
                          <li>Clique em "Entrar"</li>
                        </ol>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="mt-4">
                  <a href="/home" class="btn btn-primary btn-custom">
                    <i class="fas fa-home"></i> Voltar ao Menu
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  </body>
</html>
