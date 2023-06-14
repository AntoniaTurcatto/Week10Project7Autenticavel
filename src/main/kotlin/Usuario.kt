class Usuario(codigo:Int,senha:String):Autenticavel {

    private val codigo:Int
    private val senha:String

    init {
        this.codigo=codigo
        this.senha=senha
    }

    override fun autenticar(codigo: Int, senha: String): Boolean {
        return (this.codigo==codigo && this.senha.equals(senha))
    }

}