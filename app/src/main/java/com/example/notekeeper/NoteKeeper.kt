package com.example.notekeeper

class CourseInfo(val title: String, val courseId: String) {
    override fun toString(): String {
        return title

    }
}

data class NoteInfo(var course:CourseInfo? = null, var title: String? = null, var text: String? = null)