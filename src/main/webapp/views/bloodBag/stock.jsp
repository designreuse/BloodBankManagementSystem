<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
    <div class="col-lg-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>Blood Bag Stock</h5>
            </div>
            <div class="ibox-content">
                <table class="table">
                    <thead>
                        <tr>
                            <th>Bag Number</th>
                            <th>Donor ID</th>
                            <th>Donor Name</th>
                            <th>Blood Group</th>
                            <th>Collection Date</th>
                            <th>Red Cells</th>
                            <th>White Cells</th>
                            <th>Platelets</th>
                            <th>Plasma</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${bloodBags}" var="bloodBag">
                            <tr>
                                <td><c:out value="${bloodBag.bloodBagId}" /></td>
                                <td><c:out value="${bloodBag.donorId}" /></td>
                                <td><c:out value="${bloodBag.donor.fullName}" /></td>
                                <td><c:out value="${bloodBag.donor.aboGroup.bloodDonorGroup}" /></td>
                                <td><c:out value="${bloodBag.collectionDate}" /></td>
                                <td><c:out value="${bloodBag.redCells}" /></td>
                                <td><c:out value="${bloodBag.whiteCells}" /></td>
                                <td><c:out value="${bloodBag.platelets}" /></td>
                                <td><c:out value="${bloodBag.plasma}" /></td>
                                <td>
                                    <a href="<c:url value="/admin/blood-bag/edit/${bloodBag.id}" />" class="btn btn-success">
                                        <i class="fa fa-edit"></i>
                                    </a>
<!--                                    <a href="<c:url value="/admin/blood-bag/show/${bloodBag.id}" />" class="btn btn-info">
                                        <i class="fa fa-eye"></i>
                                    </a>-->
                                    <a href="<c:url value="/admin/blood-bag/delete/${bloodBag.id}" />" class="btn btn-danger" onClick="return checkDelete();">
                                        <i class="fa fa-trash"></i>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="ibox-footer">
            </div>
        </div>
    </div>
</div>