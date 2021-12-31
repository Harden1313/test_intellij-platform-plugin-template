package com.github.harden1313.testintellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.harden1313.testintellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
