<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 8/10/2022
  Time: 07:34
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
      String vUserName = request.getParameter("username");
      String vPassword = request.getParameter("password");

      if( !(vUserName.equals("natanael") && vPassword.equals("123456")) ){
          getServletConfig().getServletContext().getRequestDispatcher("/ErrorLogin.jsp").forward(request,response);
      }

    %>

    <nav>
        <div class="nav-wrapper">
            <a href="#" class="brand-logo">Logo</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="sass.html">Agregar Pelicula</a></li>
                <li><a href="badges.html">Listado de Peliculas</a></li>
                <li><a href="collapsible.html">Promociones</a></li>
            </ul>
        </div>
    </nav>


    <div class="row">
        <div class="col s12 m6">
            <div class="card blue-grey darken-1">
                <div class="card-content white-text">
                    <span class="card-title">Bienvenido al Sistema de CINEPOLIS</span>
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
