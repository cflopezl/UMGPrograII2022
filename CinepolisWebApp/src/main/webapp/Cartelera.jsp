<%@ page import="edu.umg.dao.PeliculaDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.umg.model.Pelicula" %><%--
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

    <nav>
        <div class="nav-wrapper">
            <a href="#" class="brand-logo">CINEPOLIS</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="sass.html">Cartelera</a></li>
                <li><a href="badges.html">Peliculas</a></li>
                <li><a href="collapsible.html">Comida</a></li>
            </ul>
        </div>
    </nav>

    <table class="striped">
        <thead>
        <tr>
            <th>Identificador</th>
            <th>Nombre</th>
            <th>Puntuacion</th>
        </tr>
        </thead>

        <tbody>

        <%
            PeliculaDAO peliculaDAO = new PeliculaDAO();
            List<Pelicula> peliculas = peliculaDAO.getAllDB();
            for( Pelicula pelicula : peliculas ){
        %>
        <tr>
            <td><%= pelicula.getId() %></td>
            <td><%= pelicula.getNombre() %></td>
            <td><%= pelicula.getPuntuacion()%>%</td>
        </tr>
        <%
            }
        %>

        </tbody>
    </table>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
