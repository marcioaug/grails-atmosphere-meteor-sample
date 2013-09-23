package org.grails.plugins.atmosphere_meteor_sample

class AtmosphereTestService {

	def recordChat(data) {
		// This method could be used to persist chat messages to a data store.
		println "AtmosphereTestService.recordChat: ${data}"
	}

	def recordIncompleteMessage(data) {
		// This method could be used to persist errors to a data store.
		println "Error AtmosphereTestService.recordIncompleteMessage: ${data}"
	}

	def recordMaliciousUseWarning(data) {
		// This method could be used to persist potential malicious code to a data store.
		println "Warning AtmosphereTestService.recordMaliciousUseWarning: ${data}"
	}

	def sendDisconnectMessage(event, request) {
		// This method could be used to send chat participants a message that a user has left.
		def message = "A user has left the chat session"
		println message
		event.broadcaster().broadcast(message)
	}
}

