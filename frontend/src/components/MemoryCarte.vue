<script setup>
import { ref } from "vue";

defineProps(["texte", "index"]);

let estRetourne=ref(false);
function retourner(){
  estRetourne.value=!estRetourne.value;
  $emit("retourne",index);
      {{ texte }}
  
}
</script>

<template>
  <div class="box2">
    <div @click="retourner()" >
      <img id="carteRetour" v-if="estRetourne" src="../assets/recto-carte.png"/>
      <img id="carte" v-else src="../assets/fondcarte.png"/>
    </div>
    <div class="table" v-if="estRetourne"> 
      {{ texte }}
    </div>
  </div>
</template>


<style>
.table{
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  padding: auto;
  margin: auto;
  font-size: 25px;
}

#carte,#carteRetour{
	max-width: 100%;
	height: auto;
}


.box2{
  position: relative;
  text-align: center;
  width: 300px;
  height: 300px;
}

</style>