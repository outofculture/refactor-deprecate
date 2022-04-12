package com.github.outofculture.refactordeprecate.services

import com.intellij.openapi.project.Project
import com.github.outofculture.refactordeprecate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
