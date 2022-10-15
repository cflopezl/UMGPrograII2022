<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 8/10/2022
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>
<body>

    <%
        // 1. obtener los valores del username y password
        String vUserName = request.getParameter("username");
        String vPassword = request.getParameter("password");

        // 2. validar si el usuario y password tienen acceso
        if( !(vUserName.equals("fernando.omar") && vPassword.equals("123456")) ){
            // 4. (False) Redirigir a una pagina indicando el error que ha ocurrido
            getServletConfig().getServletContext().getRequestDispatcher("/ErrorLogin.jsp").forward(request, response);
        }

    %>

    <nav>
        <div class="nav-wrapper">
            <a href="#" class="brand-logo">CINEPOLIS</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="Cartelera.jsp">Cartelera</a></li>
                <li><a href="badges.html">Peliculas</a></li>
                <li><a href="collapsible.html">Comida</a></li>
            </ul>
        </div>
    </nav>

    <div class="row">
        <div class="col s12 m6">
            <div class="card blue-grey darken-1">
                <div class="card-content white-text">
                    <span class="card-title">Bienvenido al Witio web de Cinepolis</span>
                    <p>I am a very simple card. I am good at containing small bits of information.
                        I am convenient because I require little markup to use effectively.</p>
                </div>
                <div class="card-action">
                    <a href="#">This is a link</a>
                    <a href="#">This is a link</a>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
