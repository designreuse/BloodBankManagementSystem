<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="sidebar-collapse">
        <ul class="nav metismenu" id="side-menu">
            <li class="nav-header">
                <div class="dropdown profile-element"> <span>
                        <img alt="image" class="img-circle" src="<c:url value="/resources/img/profile_small.jpg" />" />
                    </span>
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <span class="clear">
                            <span class="block m-t-xs"> 
                                <strong class="font-bold">
                                    David Williams
                                </strong>
                            </span> 
                            <span class="text-muted text-xs block">
                                Art Director 
                                <b class="caret"></b>
                            </span> 
                        </span> 
                    </a>
                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
                        <li><a href="profile.html">Profile</a></li>
                        <li><a href="contacts.html">Contacts</a></li>
                        <li><a href="mailbox.html">Mailbox</a></li>
                        <li class="divider"></li>
                        <li><a href="login.html">Logout</a></li>
                    </ul>
                </div>
                <div class="logo-element">
                    BBMS+
                </div>
            </li>
            <li>
                <a href="<c:url value="/admin/" />">
                    <i class="fa fa-dashboard"></i>
                    <span class="nav-label">Dashboards</span>
                </a>
            </li>
            <li class="">
                <a href="">
                    <i class="fa fa-users"></i> 
                    <span class="nav-label">Donors</span> <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="<c:url value="/admin/donor/" />">
                            Donor List
                            <span class="label label-primary pull-right">
                                <i class="fa fa-bars"></i>
                            </span>
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="/admin/donor/add-new-donor" />">
                            Add New Donor
                            <span class="label label-primary pull-right">NEW</span>
                        </a>
                    </li>
                </ul>
            </li>

            <li class="">
                <a href="">
                    <i class="fa fa-users"></i> 
                    <span class="nav-label">ABO Grouping</span> <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="<c:url value="/admin/donor/abo-grouping/" />">
                            Grouping List
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="/admin/donor/abo-grouping/add" />">
                            Add New ABO Group
                        </a>
                    </li>
                </ul>
            </li>
            
            <li class="">
                <a href="">
                    <i class="fa fa-users"></i> 
                    <span class="nav-label">Blood Bag</span> <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="<c:url value="/admin/blood-bag/collect-blood" />">
                            Collect Blood
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="/admin/blood-bag/stock" />">
                            Stock
                        </a>
                    </li>
                </ul>
            </li>
            
            
            
            





            <li>
                <a href="">
                    <i class="fa fa-diamond"></i> 
                    <span class="nav-label">Layouts</span>
                </a>
            </li>
        </ul>
    </div>
</nav>