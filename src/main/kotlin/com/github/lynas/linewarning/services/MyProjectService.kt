package com.github.lynas.linewarning.services

import com.intellij.openapi.project.Project
import com.github.lynas.linewarning.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
