export class Pokemon {
  private static AUTO_ID = 0;
  id: number;
  name: string;

  constructor (name: string) {
    this.id = Pokemon.AUTO_ID++;
    this.name = name;
  }
}
