<template>
  <div>
    <div class="barrage" style="width:70%; float:left">
      <video
          :src="'http://localhost:9000/static/video/'+this.id+'.mp4'"
          autoplay
          controls="controls"
          id="myvideo"
      >

      </video>

      <canvas id="myCanvas">

      </canvas>
    </div>
    <div style="width: 29%; float:right;">

    </div>
  </div>

</template>

<script>
export default {
  data(){
    return{
      id:"",
    }
  },
  methods:{
    getVideoURL(){
      this.id=this.$route.query.video;
    }
  },
  created(){
    this.getVideoURL()
  }
}
</script>

<style scoped lang="less">
#myvideo{
  width: 85%;
  margin-left: 10%;
}

.barrage{
  width: 100vw;
  height:80vh;
  position:relative;
  #myCanvas{
    position:absolute;
    z-index: 2;
    width: 85%;
    margin-left: 10%;
    top: 80px;
    left: 0;
    height: 40%;
  }
}
</style>