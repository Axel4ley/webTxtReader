<#import "parts/common.ftl" as c>
<@c.page>
    <#assign x></#assign>

    <div class="listOfFiles">
        <a href="/" >Back to Greeting page</a>
    <h3>Files:</h3>
    <ol>
    <#list documents as document>
    <div>
        <b>${document.id}</b>
        <span>${document.name}</span>
            <button type="button" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#myModal">Info</button>
        <a href="/main/${document.id}">statistics</a>

        <#else>
            No txt files
        </#list>

    </div>
    </ol>
    </div>

    <#--<!-- Modal &ndash;&gt;-->
    <#--<div id="myModal" class="modal fade" role="dialog">-->
        <#--<div class="modal-dialog">-->

            <#--<!-- Modal content&ndash;&gt;-->
            <#--<div class="modal-content">-->
                <#--<div class="modal-header">-->
                    <#--<button type="button" class="close" data-dismiss="modal">&times;</button>-->
                <#--</div>-->
                <#--<div class="modal-body">-->
                <#--<table cellspacing="1">-->
                <#--<tr>-->
                    <#--<th>Longest Word</th>-->
                    <#--<th>Shortest Word</th>-->
                    <#--<th>Line length</th>-->
                    <#--<th>Avarege words length</th>-->
                <#--</tr>-->
                    <#--&lt;#&ndash;<tr>&ndash;&gt;-->
                    <#--&lt;#&ndash;<td>${documentLines["${x}"].longestWord}</td>&ndash;&gt;-->
                    <#--&lt;#&ndash;<td>${documentLines["${x}"].shortestWord}</td>&ndash;&gt;-->
                    <#--&lt;#&ndash;<td>${documentLines["${x}"].length}</td>&ndash;&gt;-->
                    <#--&lt;#&ndash;<td>${documentLines["${x}"].average}</td>&ndash;&gt;-->
                    <#--&lt;#&ndash;</tr>&ndash;&gt;-->
<#--<#list documents as document>-->
                    <#--<h1>This is ${document.id}</h1>-->
<#--</#list>-->
                <#--</div>-->
                <#--<div class="modal-footer">-->
                    <#--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>-->
                <#--</div>-->
            <#--</div>-->

        <#--</div>-->
    <#--</div>-->

</@c.page>