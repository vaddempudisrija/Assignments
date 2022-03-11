package com.example;

public class Main {

	public static void main(String[] args) {
		TvRemote bpl = new BPLTv();
		TvRemote sony = new SonyTv();
		TvRemote panasonic = new PanasonicTv();

		bpl.show();
		sony.show();
		panasonic.show();

	}

}
