package wu.mq.controller;

import wu.mq.utils.Producer;

public class ProducerController {
	public static void main(String[] args) {
		Producer producer = new Producer();
		producer.init();
		producer.sendMessage("hahaha");
	}
}
