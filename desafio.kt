enum class Nivel { INICIANTE, INTERMEDIARIO, DIFICIL }

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

   fun matricular(usuarios: Usuario){
        for(usuario in usuarios)
            inscritos.add(usuario)
    }

    fun mostrarConteudos(){
        for(conteudo in conteudos)
            println(conteudo.nome)
    }

    fun mostrarInscritos(){
        for(inscrito in inscritos)
            println(inscrito.nome)
    }
}

fun main() {
// Criando os usuários
    val maria = Usuario("Júlia", 1L)
    val carla = Usuario("Andrey", 2L)
    val jose = Usuario("Osmar", 3L)
    val antonio = Usuario("Bruna", 4L)

    // Criando a lista de conteúdos da formação
    val listaConteudosKotlin: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Introdução ao Desenvolvimento Moderno de Software","Kotlin"),
        ConteudoEducacional("Java e Sua História","Java"),
        ConteudoEducacional("Orientação a Objetos - POO","Java"),
    	ConteudoEducacional("Arquiteturas e Organizações Computacionais","Fundamentos Hardware"))

    // Criando a formação para Kotlin
    val kotlinExperience = Formacao("Kotlin Experience", listaConteudosKotlin, Nivel.INICIANTE)

    // Verificando se a variável de formação não é nula, caso não seja, matriculando alunos
    kotlinExperience?.let{
        kotlinExperience.matricular(maria, carla, jose, antonio)
    }

    // Imprimindo na tela
    println("Formação: ${kotlinExperience.nome}\n\t\tConteúdos:")
    kotlinExperience.mostrarConteudos()
    println("\t\tInscritos:")
    kotlinExperience.mostrarInscritos()
    println("____________________________________________________________")
}
