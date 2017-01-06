package com.cst.dto;

public class Pager<T> {
	private int page;
	private int pageSize;
	private T entity;

	public int getPage() {
		return page;
	}

	public Pager setPage(int page) {
		this.page = page;
		return this;
	}

	public int getPageSize() {
		return pageSize;
	}

	public Pager setPageSize(int pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	public T getEntity() {
		return entity;
	}

	public Pager setEntity(T entity) {
		this.entity = entity;
		return this;
	}

	public int getOffset() {
		return (page - 1) * pageSize;
	}

}
