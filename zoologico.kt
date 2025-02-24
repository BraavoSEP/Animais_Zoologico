data class Animal(
    val apelido: String,
    val reino: String,
    val filo: String,
    val classe: String,
    val ordem: String,
    val familia: String,
    val genero: String,
    val especie: String,
    val origem: String,
    val dieta: String,
    val tipoGaiola: String,
    val localizacao: String
)

class Zoologico {
    private val animais = mutableListOf<Animal>()

    fun cadastrarAnimal(animal: Animal) {
        animais.add(animal)
        println("Animal ${animal.apelido} cadastrado com sucesso!")
    }

    fun listarAnimais() {
        if (animais.isEmpty()) {
            println("Nenhum animal cadastrado no zoológico.")
        } else {
            println("Lista de animais do zoológico:")
            animais.forEach { animal ->
                println("\nApelido: ${animal.apelido}\n" +
                        "Espécie: ${animal.especie}\n" +
                        "Origem: ${animal.origem}\n" +
                        "Dieta: ${animal.dieta}\n" +
                        "Gaiola: ${animal.tipoGaiola}\n" +
                        "Localização: ${animal.localizacao}\n")
            }
        }
    }
}

fun main() {
    val zoologico = Zoologico()

    val leao = Animal(
        apelido = "Simba",
        reino = "Animalia",
        filo = "Chordata",
        classe = "Mammalia",
        ordem = "Carnivora",
        familia = "Felidae",
        genero = "Panthera",
        especie = "Panthera leo",
        origem = "África",
        dieta = "Carnívoro",
        tipoGaiola = "Savana",
        localizacao = "Setor A - Gaiola 5"
    )

    val peixe = Animal(
        apelido = "Nemo",
        reino = "Animalia",
        filo = "Chordata",
        classe = "Actinopterygii",
        ordem = "Perciformes",
        familia = "Pomacentridae",
        genero = "Amphiprion",
        especie = "Amphiprion ocellaris",
        origem = "Oceano Pacífico",
        dieta = "Onívoro",
        tipoGaiola = "Aquário",
        localizacao = "Setor B - Tanque 3"
    )

    zoologico.cadastrarAnimal(leao)
    zoologico.cadastrarAnimal(peixe)

    zoologico.listarAnimais()
}
