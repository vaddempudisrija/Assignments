package com.assignment;

public class Rectangle extends Figure {
	int dim1;
	int dim2;

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
		this.dim1 = dim1;
		this.dim2 = dim2;

	}

	public double area() {
		return dim1 * dim2;
	}
}
