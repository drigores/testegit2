(function() {
  'use strict';

  this.cronapi = this.cronapi || {};

   /**
   * @categoryName Comentar
   */
  this.cronapi.comentario = this.cronapi.comentario || {};
  
  /**
   * @type function
   * @name **-- COMENTÁRIO --**
   * @description Inserir comentários entre os blocos de programação
   * @multilayer false  
   * @param {ObjectType.STRING} comentário comentário que será apresentado no bloco
   */
  this.cronapi.comentario.comentarioLinha = function(/** @description // */comment){
    //não faz nada, apenas para comentar nos blocos
  }

  /**
   * @type function
   * @name **-- COMENTAR BLOCOS --**
   * @description Incluir blocos que deverão ser ignorados sem a necessidade de retirá-los da lógica criada, mantendo sua posição sem desconectá-los.
   * @multilayer false  
   * @param {ObjectType.STATEMENT} conteúdo conteúdo que será invalidado / ignorado
   */
  this.cronapi.comentario.comentarioBloco = function(/** @description // */comment){
    //não faz nada, apenas para blocos
  }
  

}).bind(window)();