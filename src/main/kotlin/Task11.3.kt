fun main() {
    val message = """"Разнообразный и богатый опыт рамки и место обучения кадров требуют от нас анализа форм развития. 
        |Значимость этих проблем настолько очевидна, что укрепление и развитие структуры в значительной степени 
        |обуславливает создание соответствующий условий активизации. Повседневная практика показывает, что укрепление 
        |и развитие структуры представляет собой интересный эксперимент проверки соответствующий условий активизации. 
        |Идейные соображения высшего порядка, а также сложившаяся структура организации в значительной степени 
        |обуславливает создание позиций, занимаемых участниками в отношении поставленных задач.""".trimMargin()

    val lambda = { it: String -> it.replace(oldValue = ",", newValue = " блин") }

    val converted = messageConverter(message, lambda)
}

fun messageConverter(message: String, convert: (String) -> String): String {
    val result = convert(message)
    println(result)
    return result
}