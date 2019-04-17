package wu.mq.controller;

import wu.mq.utils.Consumer;

public class ConsumerController {
	public static void main(String[] args) {
		Consumer consumer = new Consumer();
		consumer.init();
		consumer.getMessage("hahaha");
	}
}
