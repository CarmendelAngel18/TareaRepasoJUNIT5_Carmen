
public class Time {
    private int hora;
    private int minutos;
    private int segundos;

    public Time(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Time nextSecond() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                hora = (hora + 1) % 24;
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Time time = (Time) obj;
        return hora == time.hora && minutos == time.minutos && segundos == time.segundos;
    }

}

