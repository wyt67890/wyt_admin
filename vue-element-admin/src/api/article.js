import request from '@/utils/request'

export function fetchList(query) {
  return request({
    url: '/emp/list',
    method: 'get',
    params: query
  })
}


export function fetchArticle(id) {
  return request({
    url: '/vue-element-admin/article/detail',
    method: 'get',
    params: {id}
  })
}

export function fetchPv(pv) {
  return request({
    url: '/vue-element-admin/article/pv',
    method: 'get',
    params: {pv}
  })
}

export function createArticle(data) {
  return request({
    url: '/emp/create',
    method: 'post',
    data
  })
}

export function updateArticle(data) {
  return request({
    url: '/emp/update',
    method: 'post',
    data
  })
}

export function deleteArticle(data) {
  return request({
    url: '/emp/delete',
    method: 'post',
    data
  })
}
