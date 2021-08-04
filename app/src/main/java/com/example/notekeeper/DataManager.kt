package com.example.notekeeper

object DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        courseInitializer()
      // noteIntializer()
    }

    fun courseInitializer() {
        var course = CourseInfo("android-assets", "asset_android")
        courses.set(course.courseId, course)

        course = CourseInfo("Android_Async", "async_android")
        courses.set(course.courseId, course)
        course = CourseInfo("Programming Fundamentals", "program")
        courses.set(course.courseId, course)
        course = CourseInfo("Java Fundamentals", "javas")
        courses.set(course.courseId, course)
    }
//    fun noteIntializer(){
//        var course = CourseInfo("Java Fundamentals", "program")
//
//        var note = NoteInfo(course,"android-assets","dealing with assets can be a challenge but we will walk right through it")
//        notes.add(note)
//        course =  CourseInfo("android-assets", "asset_android")
//        note = NoteInfo(course,"Android-ansync","learn android-ansync in few steps")
//        notes.add(note)
//    }


}