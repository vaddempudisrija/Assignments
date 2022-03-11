package com.assignment;

public class Traingle extends Figure {

	int dim1;
	int dim2;
	double dim3 = 0.5;

	public Traingle(int dim1, int dim2) {
		super(dim1, dim2);
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public double area() {
		return dim3 * dim1 * dim2;
	}
}
