<#import "parts/common.ftl" as c>
<@c.page>
    <div >
        <table cellspacing="15">
        <tr>
            <th>Longest Word</th>
            <th>Shortest Word</th>
            <th>Line length</th>
            <th>Avarege words length</th>
            <th>Line</th>
        </tr>


    <#list documentLines as line>

         <tr>
            <td>${line.longestWord}</td>
            <td>${line.shortestWord}</td>
            <td>${line.length}</td>
            <td>${line.average}</td>
            <td>${line.line}</td>
        </tr>
    </#list>
    </div>

</@c.page>