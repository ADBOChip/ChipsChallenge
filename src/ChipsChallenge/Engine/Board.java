package ChipsChallenge.Engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bimobbb
 */
public class Board {

    private Tile[][] world;
    private Player p;
    private Tembok wall;
    private Pintu door;
    private Api fire;
    private Air water;
    private SepatuAir sAir;
    private SepatuApi sApi;
    private Portal port;
    private Kunci key;
    private Chip chips;
    private Tile tile;
    private int sisaChips = 0;
    private Tile temp;
    private int tempX;
    private int tempY;
    private int tempAirApiX;
    private int tempAirApiY;

    public Board() {
        world = new Tile[15][15];
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world.length; j++) {
                world[i][j] = new Tile(i, j);
            }
        }
        wall = new Tembok();
        fire = new Api();
        water = new Air();
        door = new Pintu();
        port = new Portal();
        sApi = new SepatuApi();
        sAir = new SepatuAir();
        key = new Kunci();
        tile = new Tile();
        chips = new Chip();
        temp = new Tile(6, 7);
        world[0][14] = new Portal(0, 14);
        world[2][0] = new Kunci(2, 0);
        world[6][0] = new Kunci(6, 0);
        world[10][1] = new Kunci(10, 1);
        world[13][14] = new Kunci(13, 14);
        world[3][3] = new Pintu(3, 3);
        world[13][4] = new Pintu(13, 4);
        world[11][9] = new Pintu(11, 9);
        world[5][14] = new Pintu(5, 14);
        for (int i = 0; i < 11; i++) {
            world[i][9] = new Tembok(i, 9);
        }
        for (int i = 0; i < 4; i++) {
            world[4][i] = new Tembok(4, i);
        }
        for (int i = 0; i < 4; i++) {
            world[9][i] = new Tembok(9, i);
        }
        for (int i = 10; i < 14; i++) {
            world[5][i] = new Tembok(5, i);
        }
        world[0][3] = new Tembok(0, 3);
        world[1][3] = new Tembok(1, 3);
        world[2][3] = new Tembok(2, 3);
        world[5][2] = new Tembok(5, 2);
        world[6][2] = new Tembok(6, 2);
        world[10][3] = new Tembok(10, 3);
        world[11][3] = new Tembok(11, 3);
        world[12][3] = new Tembok(12, 3);
        world[12][9] = new Tembok(12, 9);
        world[13][9] = new Tembok(13, 9);
        world[14][9] = new Tembok(14, 9);
        world[1][10] = new Tembok(1, 10);
        world[2][10] = new Tembok(2, 10);
        world[3][10] = new Tembok(3, 10);
        world[14][3] = new Tembok(14, 3);
        world[11][4] = new SepatuAir(11, 4);
        world[13][12] = new SepatuApi(13, 12);

        this.paintWaterFire();
        world[1][0] = new Chip(1, 0);
        this.sisaChips++;
        world[1][13] = new Chip(1, 13);
        this.sisaChips++;
        world[11][1] = new Chip(11, 1);
        this.sisaChips++;
        world[2][6] = new Chip(2, 6);
        this.sisaChips++;
        world[10][11] = new Chip(10, 11);
        this.sisaChips++;
    }

    public void newGame() {
        p = new Player(6, 6);
        world[this.p.getX()][this.p.getY()] = p;
    }

    public void paintWaterFire() {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                world[i][j] = new Air(i, j);
            }
        }
        for (int i = 11; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 11 && j == 1) {

                } else {
                    world[i][j] = new Air(i, j);
                }
            }
        }
        for (int i = 5; i < 8; i++) {
            world[5][i] = new Air(5, i);
        }
        for (int i = 5; i < 8; i++) {
            world[8][i] = new Air(8, i);
        }
        for (int i = 11; i < 14; i++) {
            world[0][i] = new Air(0, i);
        }
        for (int i = 12; i < 15; i++) {
            world[2][i] = new Air(2, i);
        }
        for (int i = 11; i < 15; i++) {
            world[i][10] = new Air(i, 10);
        }
        for (int i = 11; i < 15; i++) {
            world[14][i] = new Air(14, i);
        }
        world[10][0] = new Air(10, 0);
        world[10][2] = new Air(10, 2);
        world[13][3] = new Air(13, 3);
        world[6][5] = new Air(6, 5);
        for (int i = 0; i < 3; i++) {
            world[8][i] = new Api(8, i);
        }
        for (int i = 5; i < 8; i++) {
            world[4][i] = new Api(4, i);
        }
        for (int i = 5; i < 8; i++) {
            world[7][i] = new Api(7, i);
        }
        for (int i = 10; i < 15; i++) {
            world[4][i] = new Api(4, i);
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 5; j < 8; j++) {
                world[i][j] = new Api(i, j);
            }
        }
        for (int i = 11; i < 14; i++) {
            for (int j = 5; j < 8; j++) {
                world[i][j] = new Api(i, j);
            }
        }
        for (int i = 6; i < 11; i++) {
            for (int j = 10; j < 15; j++) {
                if (i == 10 && j == 11) {

                } else {
                    world[i][j] = new Api(i, j);
                }
            }
        }
        for (int i = 10; i < 13; i++) {
            for (int j = 11; j < 15; j++) {
                if (i == 10 && j == 11) {

                } else {
                    world[i][j] = new Api(i, j);
                }
            }
        }
        world[13][11] = new Api(13, 11);
        world[13][13] = new Api(13, 13);
    }

    public void repaintMap() {
        world[this.tempX][this.tempY] = new Tile(this.tempX, this.tempY);
        this.paintWaterFire();
        world[this.p.getX()][this.p.getY()] = p;
    }

    public char getTileInfo(int x, int y) {
        return world[x][y].getInfo();
    }

    public void playerMoveUp() {
        if (this.p.getX() != 0) {
            this.temp = world[this.p.getX() - 1][this.p.getY()];
            this.tempX = this.p.getX();
            this.tempY = this.p.getY();
            this.tempAirApiX = temp.getX();
            this.tempAirApiY = temp.getY();
            if (world[this.p.getX() - 1][this.p.getY()].getInfo() == wall.getInfo()) {

            } else if (world[this.p.getX() - 1][this.p.getY()].getInfo() == fire.getInfo()) {
                if (this.p.getStatusShoeF() == true) {
                    this.p.moveUp();
                } else {
                    this.p.isDead();
                }
            } else if (world[this.p.getX() - 1][this.p.getY()].getInfo() == water.getInfo()) {
                if (this.p.getStatusShoeW() == true) {
                    this.p.moveUp();
                } else {
                    this.p.isDead();
                }
            } else if (world[this.p.getX() - 1][this.p.getY()].getInfo() == door.getInfo()) {
                if (this.p.bisaBukaPintu() == true) {
                    this.p.moveUp();
                    this.p.pakaiKunci();
                } else {

                }
            } else if (world[this.p.getX() - 1][this.p.getY()].getInfo() == sAir.getInfo()) {
                this.p.setstatusShoeW(true);
                this.p.moveUp();

            } else if (world[this.p.getX() - 1][this.p.getY()].getInfo() == sApi.getInfo()) {
                this.p.setstatusShoeF(true);
                this.p.moveUp();

            } else if (world[this.p.getX() - 1][this.p.getY()].getInfo() == key.getInfo()) {
                this.p.addKunci();
                this.p.moveUp();
            } else if (world[this.p.getX() - 1][this.p.getY()].getInfo() == port.getInfo()) {
                if (this.sisaChips == 0) {
                    this.p.moveUp();
                    this.p.endGame();
                }

            } else if (world[this.p.getX() - 1][this.p.getY()].getInfo() == chips.getInfo()) {
                this.p.moveUp();
                this.sisaChips--;
            } else {
                this.p.moveUp();
            }
        }

    }

    public void playerMoveDown() {

        if (this.p.getX() != 14) {
            this.temp = world[this.p.getX() + 1][this.p.getY()];
            this.tempX = this.p.getX();
            this.tempY = this.p.getY();
            this.tempAirApiX = temp.getX();
            this.tempAirApiY = temp.getY();
            if (world[this.p.getX() + 1][this.p.getY()].getInfo() == wall.getInfo()) {

            } else if (world[this.p.getX() + 1][this.p.getY()].getInfo() == fire.getInfo()) {
                if (this.p.getStatusShoeF() == true) {
                    this.p.moveDown();
                } else {
                    this.p.isDead();
                }
            } else if (world[this.p.getX() + 1][this.p.getY()].getInfo() == water.getInfo()) {
                if (this.p.getStatusShoeW() == true) {
                    this.p.moveDown();
                } else {
                    this.p.isDead();
                }
            } else if (world[this.p.getX() + 1][this.p.getY()].getInfo() == door.getInfo()) {
                if (this.p.bisaBukaPintu() == true) {
                    this.p.moveDown();
                    this.p.pakaiKunci();
                } else {

                }
            } else if (world[this.p.getX() + 1][this.p.getY()].getInfo() == sAir.getInfo()) {
                this.p.setstatusShoeW(true);
                this.p.moveDown();

            } else if (world[this.p.getX() + 1][this.p.getY()].getInfo() == sApi.getInfo()) {
                this.p.setstatusShoeF(true);
                this.p.moveDown();

            } else if (world[this.p.getX() + 1][this.p.getY()].getInfo() == key.getInfo()) {
                this.p.addKunci();
                this.p.moveDown();
            } else if (world[this.p.getX() + 1][this.p.getY()].getInfo() == port.getInfo()) {
                if (this.sisaChips == 0) {
                    this.p.moveDown();
                    this.p.endGame();
                }
            } else if (world[this.p.getX() + 1][this.p.getY()].getInfo() == chips.getInfo()) {
                this.p.moveDown();
                this.sisaChips--;
            } else {
                this.p.moveDown();
            }
        } else {

        }

    }

    public void playerMoveLeft() {

        if (this.p.getY() != 0) {
            this.temp = world[this.p.getX()][this.p.getY() - 1];
            this.tempX = this.p.getX();
            this.tempY = this.p.getY();
            this.tempAirApiX = temp.getX();
            this.tempAirApiY = temp.getY();
            if (world[this.p.getX()][this.p.getY() - 1].getInfo() == wall.getInfo()) {

            } else if (world[this.p.getX()][this.p.getY() - 1].getInfo() == fire.getInfo()) {
                if (this.p.getStatusShoeF() == true) {
                    this.p.moveLeft();
                } else {
                    this.p.isDead();
                }
            } else if (world[this.p.getX()][this.p.getY() - 1].getInfo() == water.getInfo()) {
                if (this.p.getStatusShoeW() == true) {
                    this.p.moveLeft();
                } else {
                    this.p.isDead();
                }
            } else if (world[this.p.getX()][this.p.getY() - 1].getInfo() == door.getInfo()) {
                if (this.p.bisaBukaPintu() == true) {
                    this.p.moveLeft();
                    this.p.pakaiKunci();
                } else {

                }
            } else if (world[this.p.getX()][this.p.getY() - 1].getInfo() == sAir.getInfo()) {
                this.p.setstatusShoeW(true);
                world[this.p.getX()][this.p.getY() - 1] = new Tile(this.p.getX() + 1, this.p.getY());
            } else if (world[this.p.getX()][this.p.getY() - 1].getInfo() == sApi.getInfo()) {
                this.p.setstatusShoeF(true);
                world[this.p.getX()][this.p.getY() - 1] = new Tile(this.p.getX() + 1, this.p.getY());
            } else if (world[this.p.getX()][this.p.getY() - 1].getInfo() == key.getInfo()) {
                this.p.addKunci();
                this.p.moveLeft();
            } else if (world[this.p.getX()][this.p.getY() - 1].getInfo() == port.getInfo()) {
                if (this.sisaChips == 0) {
                    this.p.moveLeft();
                    this.p.endGame();
                }
            } else if (world[this.p.getX()][this.p.getY() - 1].getInfo() == chips.getInfo()) {
                this.p.moveLeft();
                this.sisaChips--;
            } else {
                this.p.moveLeft();
            }
        }

    }

    public void playerMoveRight() {

        if (this.p.getY() != 14) {
            this.temp = world[this.p.getX()][this.p.getY() + 1];
            this.tempX = this.p.getX();
            this.tempY = this.p.getY();
            this.tempAirApiX = temp.getX();
            this.tempAirApiY = temp.getY();
            if (world[this.p.getX()][this.p.getY() + 1].getInfo() == wall.getInfo()) {

            } else if (world[this.p.getX()][this.p.getY() + 1].getInfo() == fire.getInfo()) {
                if (this.p.getStatusShoeF() == true) {
                    this.p.moveRight();
                } else {
                    this.p.isDead();
                }
            } else if (world[this.p.getX()][this.p.getY() + 1].getInfo() == water.getInfo()) {
                if (this.p.getStatusShoeW() == true) {
                    this.p.moveRight();
                } else {
                    this.p.isDead();
                }
            } else if (world[this.p.getX()][this.p.getY() + 1].getInfo() == door.getInfo()) {
                if (this.p.bisaBukaPintu() == true) {
                    this.p.moveRight();
                    this.p.pakaiKunci();
                } else {

                }
            } else if (world[this.p.getX()][this.p.getY() + 1].getInfo() == sAir.getInfo()) {
                this.p.setstatusShoeW(true);
                world[this.p.getX()][this.p.getY() + 1] = new Tile(this.p.getX() + 1, this.p.getY());
            } else if (world[this.p.getX()][this.p.getY() + 1].getInfo() == sApi.getInfo()) {
                this.p.setstatusShoeF(true);
                world[this.p.getX()][this.p.getY() + 1] = new Tile(this.p.getX() + 1, this.p.getY());
            } else if (world[this.p.getX()][this.p.getY() + 1].getInfo() == key.getInfo()) {
                this.p.addKunci();
                this.p.moveRight();
            } else if (world[this.p.getX()][this.p.getY() + 1].getInfo() == port.getInfo()) {
                if (this.sisaChips == 0) {
                    this.p.moveRight();
                    this.p.endGame();
                }
            } else if (world[this.p.getX()][this.p.getY() + 1].getInfo() == chips.getInfo()) {
                this.p.moveRight();
                this.sisaChips--;
            } else {
                this.p.moveRight();
            }
        }
    }

    public boolean isAlive() {
        return this.p.getLife();
    }

    public int panjangTile() {
        return world.length;
    }

    public Board getBoard() {
        return this;
    }

    public Tile[][] kembalikanTile() {
//        this.printWorld();
        return this.world;

    }
}
