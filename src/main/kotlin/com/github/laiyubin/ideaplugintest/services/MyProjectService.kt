package com.github.laiyubin.ideaplugintest.services

import com.github.laiyubin.ideaplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
