package com.dianping.puma.core.model;

public class BinlogStat {

	private Long rowsInsert;

	private Long rowsDelete;

	private Long rowsUpdate;

	private Long ddls;

	public Long getRowsInsert() {
		return rowsInsert;
	}

	public void setRowsInsert(Long rowsInsert) {
		this.rowsInsert = rowsInsert;
	}

	public Long getRowsDelete() {
		return rowsDelete;
	}

	public void setRowsDelete(Long rowsDelete) {
		this.rowsDelete = rowsDelete;
	}

	public Long getRowsUpdate() {
		return rowsUpdate;
	}

	public void setRowsUpdate(Long rowsUpdate) {
		this.rowsUpdate = rowsUpdate;
	}

	public Long getDdls() {
		return ddls;
	}

	public void setDdls(Long ddls) {
		this.ddls = ddls;
	}
}