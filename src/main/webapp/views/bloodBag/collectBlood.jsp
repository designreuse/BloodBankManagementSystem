<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
    <div class="col-lg-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>Collect Blood</h5>
            </div>
            <div class="ibox-content">
                <sf:form class="form" commandName="bloodBag" method="POST">
                    <div class="row">
                        <div class="col-lg-6">
                            <c:set var="bloodBagIdHasBindError"><sf:errors path="bloodBagId"/></c:set>
                            <div class="form-group <c:if test="${!empty bloodBagIdHasBindError}" > has-error </c:if> ">
                                <sf:label path="bloodBagId" cssClass="control-label">Blood Bag Number</sf:label>
                                <sf:input path="bloodBagId" cssClass="form-control" palceholder="Blood Bag Number" />
                                <p><sf:errors path="bloodBagId" /></p>
                            </div>                    
                            <c:set var="donorIdHasBindError"><sf:errors path="donor"/></c:set>
                            <div class="form-group <c:if test="${!empty donorIdHasBindError}" > has-error </c:if> ">
                                <sf:label path="donor" cssClass="control-label">Blood Donor</sf:label>
                                <sf:select path="donor" cssClass="form-control" >
                                    <sf:option value="${null}">--- Select Item Name ---</sf:option>
                                    <sf:options items="${donors}" itemValue="donorId" itemLabel="fullName"/>
                                </sf:select>
                                <p><sf:errors path="donor" /></p>
                            </div>                    
                            <c:set var="collectionDateHasBindError"><sf:errors path="collectionDate"/></c:set>
                            <div class="form-group <c:if test="${!empty collectionDateHasBindError}" > has-error </c:if> ">
                                <sf:label path="collectionDate" cssClass="control-label">Date (yyyy/MM/dd)</sf:label>
                                <sf:input path="collectionDate" cssClass="form-control" palceholder="" />
                                <p><sf:errors path="collectionDate" /></p>
                            </div>
                            <c:set var="redCellsHasBindError"><sf:errors path="redCells"/></c:set>
                            <div class="form-group <c:if test="${!empty redCellsHasBindError}" > has-error </c:if> ">
                                <sf:label path="redCells" cssClass="control-label">Red Cells</sf:label>
                                <sf:input path="redCells" cssClass="form-control" palceholder="Red Cells" />
                                <p><sf:errors path="redCells" /></p>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <c:set var="whiteCellsHasBindError"><sf:errors path="whiteCells"/></c:set>
                            <div class="form-group <c:if test="${!empty whiteCellsHasBindError}" > has-error </c:if> ">
                                <sf:label path="whiteCells" cssClass="control-label">White Cells</sf:label>
                                <sf:input path="whiteCells" cssClass="form-control" palceholder="White Cells" />
                                <p><sf:errors path="whiteCells" /></p>
                            </div>                    
                            <c:set var="plateletsHasBindError"><sf:errors path="platelets"/></c:set>
                            <div class="form-group <c:if test="${!empty plateletsHasBindError}" > has-error </c:if> ">
                                <sf:label path="platelets" cssClass="control-label">Platelets</sf:label>
                                <sf:input path="platelets" cssClass="form-control" palceholder="Red Cells" />
                                <p><sf:errors path="platelets" /></p>
                            </div>                    
                            <c:set var="plasmaHasBindError"><sf:errors path="plasma"/></c:set>
                            <div class="form-group <c:if test="${!empty plasmaHasBindError}" > has-error </c:if> ">
                                <sf:label path="plasma" cssClass="control-label">Plasma</sf:label>
                                <sf:input path="plasma" cssClass="form-control" palceholder="Red Cells" />
                                <p><sf:errors path="plasma" /></p>
                            </div>
                            <div class="form-group">
                                <div class="" style="margin-top: 39px"> 
                                    <button class="btn btn-sm btn-info" type="submit">Save Blood Bag</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </sf:form>
            </div>
            <div class="ibox-footer">
            </div>
        </div>
    </div>
</div>