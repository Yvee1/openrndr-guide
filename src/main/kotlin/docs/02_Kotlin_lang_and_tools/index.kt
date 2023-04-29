@file:Suppress("UNUSED_EXPRESSION")
@file:Title("Kotlin language and tools")
@file:Order("1020")
@file:URL("kotlinLanguageAndTools/index")

package docs.`02_Kotlin_lang_and_tools`

import org.openrndr.dokgen.annotations.*

fun main() {
    @Text
    """
    # Kotlin language and tools
    
    OPENRNDR is written using the Kotlin programming language,
    which is similar to Java but more modern and less verbose.
    
    The Gradle build tool is used by the OPENRNDR projects 
    to download dependencies, build and distribute projects.
    
    """.trimIndent()
}
