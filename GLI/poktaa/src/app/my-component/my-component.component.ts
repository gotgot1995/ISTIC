import { Component, OnInit } from '@angular/core';
import { Pokemon } from '../pokemon';

const POKEMONS_RAW_DATA: Array<Pokemon> = [
  new Pokemon('Pikachu'),
  new Pokemon('Roucoule'),
  new Pokemon('Salamèche'),
  new Pokemon('Bulbizarre'),
];

@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent implements OnInit {
  id: number;

  pokemons: Array<Pokemon> = [];

  selected_pokemon: Pokemon;

  constructor() {
    this.pokemons = POKEMONS_RAW_DATA;
  }

  ngOnInit() {
  }

}
