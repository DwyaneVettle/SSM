// pages/list/list.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    list: []
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    var that = this;  // 这个地方非常重要, 请注意这个this的变化

    wx.request({
      url: 'http://127.0.0.1/base/person/data',
      method: 'GET',
      data: {},
      success: function(rs) {
        var toastText = "获取数据失败, 原因:" + rs.data.message;
        if (rs.data.status == 200) {
          var result = rs.data.data;
          if (result == null) {
            toastText = "无数据";
            wx.showToast({
              title: toastText,
              icon: '',
              duration: 2000
            })
          } else {
            that.setData({
              list: result
            })
          }
        } else {          
          wx.showToast({
            title: toastText,
            icon: '',
            duration: 2000
          })
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

  addPerson: function() {
    wx.navigateTo({
      url: '../person/person',
    })
  },

  delPerson: function (paramData) {
    var that = this;
    wx.showModal({
      title: '提示',
      content: '是否删除[' + paramData.target.dataset.name + ']吗？',
      success: function (sm) {
        if (sm.confirm) {
          wx.request({
            url: 'http://127.0.0.1/base/person/delete',
            method: 'GET',
            data: { 'id': paramData.target.dataset.id },
            success: function (rs) {

              var result = rs.data.status;
              var toastText = '删除失败';

              if (result == 200) {
                toastText = '删除成功';
                that.data.list.splice(paramData.target.dataset.index, 1);
                that.setData({
                  list: that.data.list
                });
              }

              wx.showToast({
                title: toastText,
                icon: '',
                duration: 2000
              })

            }
          })

        }
      }
    })
  }

})