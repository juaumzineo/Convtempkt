import javax.swing.JOptionPane
import java.text.DecimalFormat
object ConversorTemp {
    fun fahcelsius(x: Double): Double { return (x - 32) * 5 / 9 }; fun kelcel(y: Double): Double { return y - 273.15 }
    @JvmStatic
    fun main(args: Array<String>) {
        val df = DecimalFormat("###,##0.00")
        val options = arrayOf("Fahrenheit", "Kelvin")
        val x = JOptionPane.showOptionDialog(null, "Qual medida converter para celsius?", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0])
        if (x == 0) {
            val a = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit: ").toDouble()
            JOptionPane.showMessageDialog(null, "Fahrenheit em Celsius: " + df.format(fahcelsius(a)))}
        else {
            val b = JOptionPane.showInputDialog("Digite a temperatura em Kelvin: ").toDouble()
            JOptionPane.showMessageDialog(null, "Kelvin em Celsius: " + df.format(kelcel(b)))}
    }}
