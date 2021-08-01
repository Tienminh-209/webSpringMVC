package com.buiminhtien.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RELATED")
public class Related {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	@Column(name = "id_product")
	protected int id_product;
	@Column(name = "id_related")
	protected int id_related;

	public Related() {
		super();
		// TODO Auto-generated method stub
	}

	public Related(int id, int id_product, int id_related) {
		this.id = id;
		this.id_product = id_product;
		this.id_related = id_related;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public int getId_related() {
		return id_related;
	}

	public void setId_related(int id_related) {
		this.id_related = id_related;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + id_product;
		result = prime * result + id_related;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Related other = (Related) obj;
		if (id != other.id)
			return false;
		if (id_product != other.id_product)
			return false;
		if (id_related != other.id_related)
			return false;
		return true;
	}

}
