package by.dk.training.items.dataaccess.filters;

import javax.persistence.metamodel.SingularAttribute;

public class UserFilter {

    private String login;
    private SingularAttribute sortProperty;
    private boolean sortOrder;
    private Integer offset;
    private Integer limit;

    private boolean isFetchCredentials;
    private boolean isFetchPackages;
    
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public SingularAttribute getSortProperty() {
		return sortProperty;
	}
	public void setSortProperty(SingularAttribute sortProperty) {
		this.sortProperty = sortProperty;
	}
	public boolean isSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(boolean sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public boolean isFetchCredentials() {
		return isFetchCredentials;
	}
	public void setFetchCredentials(boolean isFetchCredentials) {
		this.isFetchCredentials = isFetchCredentials;
	}
	public boolean isFetchPackages() {
		return isFetchPackages;
	}
	public void setFetchPackages(boolean isFetchPackages) {
		this.isFetchPackages = isFetchPackages;
	}
}
