<#include "main-template.ftl"/>

<#macro content>
    <#if users?has_content>
        <ul>
            <#list users as user>
                <li>${user.name} ${user.surname} ${user.email}</li>
            </#list>
        </ul>
    <#else>
        <p>No users yet</p>
    </#if>
    <a href="/spring_security/logout">Logout</a>
</#macro>

<@main title="Users"/>
