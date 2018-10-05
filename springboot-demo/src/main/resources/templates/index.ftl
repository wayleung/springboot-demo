<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
<#--<link href="/css/index.css" rel="stylesheet" />-->

</head>
<body>
<table class="table">
    <thead>User Desc</thead>
    <tr>
        <th>id</th>
        <th>username</th>
        <th>password</th>
        <th>gender</th>
        <th>birthdate</th>
    </tr>

    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <#--<td>${gender}</td>-->
        <td>${(user.gender==1)?then('男','女')}</td>
        <#--如果是unix生成的时间戳是精确到秒级的，而java是精确到毫秒级的，如果我将时间戳转为long再*1000是否有效？实验：-->
        <#--string转为number再*1000-->
        <#--<#assign dlong = birthdate?number * 1000 />-->
        <#assign dlong = user.birthdate*1000 />
        <td>${dlong?number_to_datetime?string('yyyy-MM-dd HH:mm:ss')}</td>
    </tr>
</table>

</body>
<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</html>
