/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Bharatvanshi {
    
    abstract void fight();
    abstract void obey();


    void kind() {
        System.out.println("Kindness is a characteristic.");
    }
}

class Pandav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Pandav is fighting.");
    }

    @Override
    void obey() {
        System.out.println("Pandav is obeying.");
    }
}

class Kaurav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Kaurav is fighting.");
    }

    @Override
    void obey() {
        System.out.println("Kaurav is disobeying.");
    }

    @Override
    void kind() {
        System.out.println("Kaurav is cruel.");
    }
}

class Arjun extends Pandav {

}

class Bheem extends Pandav {
    @Override
    void kind() {
        System.out.println("Bheem is less kind.");
    }
}

class Duryodhan extends Kaurav {
 
}

class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn is obeying.");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind.");
    }
}

public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        arjun.fight();
        arjun.obey();
        arjun.kind();

        Bheem bheem = new Bheem();
        bheem.fight();
        bheem.obey();
        bheem.kind();

        Duryodhan duryodhan = new Duryodhan();
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        Vikarn vikarn = new Vikarn();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
