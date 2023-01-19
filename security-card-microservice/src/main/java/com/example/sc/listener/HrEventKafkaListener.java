package com.example.sc.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HrEventKafkaListener {

	@KafkaListener(topics = "hr-events", groupId = "security-card")
	public void listenHrEvents(String event) throws Exception {
		System.err.println(event);

	}
}
